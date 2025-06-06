const base = {
    get() {
        return {
            url : "http://localhost:8080/weixindiancan/",
            name: "weixindiancan",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/weixindiancan/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "微信点餐小程序"
        } 
    }
}
export default base
