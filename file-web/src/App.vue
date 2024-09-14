<template>
  <div id="app">
    <Header></Header>
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

<style lang="stylus">
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
}
</style>