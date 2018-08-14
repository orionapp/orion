const merge = require('./build/node_modules/webpack-merge/lib/index.js');
const common = require('./webpack.common.js');
const webpack = require('./build/node_modules/webpack/lib/webpack.js');

module.exports = merge(common, {
    mode: 'development',
    devtool: 'inline-source-map',
    plugins: [
        new webpack.DefinePlugin({
            'process.env.NODE_ENV': JSON.stringify('development')
        })
    ]
});