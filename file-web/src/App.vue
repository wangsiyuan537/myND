<template>
  <div id="app">
    <div id="nav">
      <router-link to="/">首页</router-link> |
      <router-link to="/login">登录页面</router-link> |
      <router-link to="/register">注册页面</router-link>
      <Header></Header>
    </div>
    <router-view />
  </div>
</template>
<style lang="stylus">
#app
  font-family Avenir, Helvetica, Arial, sans-serif
  -webkit-font-smoothing antialiased
  -moz-osx-font-smoothing grayscale
</style>
<script>
import Header from "@/components/Header.vue"; //  1. 引入组件

export default {
  name: "App",
  //  2. 注册组件
  components: {
    Header,
  },
};
</script>