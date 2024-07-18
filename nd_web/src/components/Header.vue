<template>
  <el-menu :default-active="activeIndex" :router="true" mode="horizontal">
    <el-menu-item index="Home" :route="{ name: 'Home' }">首页</el-menu-item>
    <el-menu-item index="Login" :route="{ name: 'Login' }">登录</el-menu-item>
    <el-menu-item index="Register" :route="{ name: 'Register' }"
    >注册</el-menu-item
    >
  </el-menu>
</template>

<script>
export default {
  name: "Header",
  data() {
    return {};
  },
  computed: {
    // 当前激活菜单的 index
    activeIndex() {
      return this.$route.name; //  获取当前路由名称
    },
  },
};
</script>