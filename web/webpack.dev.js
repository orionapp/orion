const path = require('path');
const merge = require('./build/node_modules/webpack-merge/lib/index.js');
const common = require('./webpack.common.js');
const webpack = require('./build/node_modules/webpack/lib/webpack.js');

module.exports = merge(common, {
    mode: 'development',
    devtool: 'inline-source-map',
    devServer: {
        contentBase: path.resolve('./bundle'),
        historyApiFallback: true,
        compress: true,
    },
    plugins: [
        new webpack.DefinePlugin({
            'process.env.NODE_ENV': JSON.stringify('development')
        })
    ]
});