import Vue from "vue";
import VueRouter from "vue-router"; //  引入vue-router模块
import Home from "../views/Home/index.vue";
import Login from "@/views/Login.vue"; //  引入Home页面对应的文件

Vue.use(VueRouter); //  将VueRouter挂载在Vue上

// 创建路由列表
const routes = [
    {
        path: "/", //  路由路径，即浏览器地址栏中显示的URL
        name: "Home", //  路由名称
        component: Home, //  路由所使用的页面
        meta: {
            requiresAuth: true
        }
    },
    {
        path: "/login",
        name: "Login",
        component: () => import("../views/Login.vue"),
    },
    {
        path: "/register",
        name: "Register",
        component: () => import("../views/Register.vue"),
    },
    {
        path: "*",
        name: "Error_404",
        component: () => import("../views/Error_404.vue"),
    }
];

// 创建路由实例
const router = new VueRouter({
    mode: "history", //  HTML5 History 模式
    base: process.env.BASE_URL,
    routes,
});

export default router;

const originalPush = VueRouter.prototype.push;
VueRouter.prototype.push = function push(location) {
    return originalPush.call(this, location).catch((err) => err);
};