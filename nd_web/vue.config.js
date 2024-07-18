const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true
})
module.exports = {
  publicPath: './',
  devServer:{
    host: '0.0.0.0',
    open: true,

  }
}
