const merge = require('./build/node_modules/webpack-merge/lib/index.js');
const common = require('./webpack.common.js');
const webpack = require('./build/node_modules/webpack/lib/webpack.js');
const UglifyJsPlugin = require('./build/node_modules/uglifyjs-webpack-plugin/dist/cjs.js');

module.exports = merge(common, {
    mode: 'production',
    devtool: 'source-map',
    optimization: {
        minimizer: [
            new UglifyJsPlugin({
                parallel: true,
                sourceMap: true,
                uglifyOptions: {
                    warnings: false,
                    compress: {
                        drop_console: true,
                        conditionals: true,
                        unused: true,
                        comparisons: true,
                        dead_code: true,
                        if_return: true,
                        join_vars: true,
                        warnings: false,
                    },
                    output: {
                        comments: false,
                    },
                },
            }),
        ]
    },
    plugins: [
        new webpack.DefinePlugin({
            'process.env.NODE_ENV': JSON.stringify('production')
        })
    ]
});