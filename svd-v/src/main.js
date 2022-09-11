import { createApp } from 'vue'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import App from './App.vue'
import router from './router'
import store from './store'
import zhCn from 'element-plus/es/locale/lang/zh-cn'
import * as ElementPlusIconsVue from '@element-plus/icons-vue'

/* 引入自己的 css 文件 */
import '@/assets/css/global.css'

const app = createApp(App)

// 注册所有 icons
for (const [key, component] of Object.entries(ElementPlusIconsVue)) {
    app.component(key, component)
}

app.use(store)
app.use(router)
app.use((ElementPlus), {
    locale: zhCn,
    size: 'small'
})
app.mount('#app')