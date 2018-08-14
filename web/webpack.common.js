const config = require('./build/WebPackHelper.js');
const path = require('path');
const webpack = require('./build/node_modules/webpack/lib/webpack.js');
const HtmlWebpackPlugin = require('./build/node_modules/html-webpack-plugin/index.js');
const CleanWebpackPlugin = require('./build/node_modules/clean-webpack-plugin/index.js');

module.exports = {
  entry: config.moduleName,
  output: {
    path: path.resolve('./bundle'),
    publicPath: '',
    filename: '[name].bundle.js'
  },
  resolve: {
    modules: [ path.resolve('js'), path.resolve('..', 'src'), path.resolve('.'), path.resolve('node_modules') ],
    extensions: ['*', '.js']
  },
  module: {
    rules: [
      {
        test: /\.css$/,
        use: ['style-loader', 'css-loader']
      },
      {
        test: /\.(eot|svg|ttf|woff|woff2|png|jpg|gif)$/,
        use: ['file-loader']
      }
    ]
  },
  plugins: [
    new CleanWebpackPlugin([path.resolve('./bundle')]),
    new HtmlWebpackPlugin({
        template: "../public/template.html",
        favicon: "../../assets/images/favicon/favicon.ico",
        filename: "index.html",
        title: "Orion",
        meta: {
            viewport: 'width=device-width, initial-scale=1, shrink-to-fit=no',
            MobileOptimized: '320',
            HandheldFriendly: 'True',
            country: 'US',
            language: 'en',
            locale: 'US'
        }
    }),
    new webpack.HotModuleReplacementPlugin(),
  ],
};