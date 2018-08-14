const merge = require('./build/node_modules/webpack-merge/lib/index.js');
const common = require('./webpack.common.js');
const webpack = require('./build/node_modules/webpack/lib/webpack.js');
const UglifyJsPlugin = require('./build/node_modules/uglifyjs-webpack-plugin/dist/cjs.js');

module.exports = merge(common, {
    mode: 'production',
    devtool: 'source-map',
    plugins: [
        new UglifyJsPlugin({
            parallel: true,
            uglifyOptions: {
                sourceMap: true,
                compress: {
                    drop_console: true,
                    conditionals: true,
                    unused: true,
                    comparisons: true,
                    dead_code: true,
                    if_return: true,
                    join_vars: true,
                    warnings: false
                },
                output: {
                    comments: false
                }
            },
        }),
        new webpack.DefinePlugin({
            'process.env.NODE_ENV': JSON.stringify('production')
        })
    ]
});