<html>
    <head>
        <title>User</title>
        <meta charset="UTF-8">
    </head>
    <body>
        <table border="1px" cellpadding="" cellspacing="0">
            <caption>User表</caption>
            <thead>
            <tr>
                <td>ID</td>
                <td>用户名</td>
                <td>密码</td>
                <td>姓名</td>
            </tr>
            </thead>
            <tbody>
            <#list userlist as user>
                <tr align="center">
                    <td>${user.id}</td>
                    <td>${user.username}</td>
                    <td>${user.password}</td>
                    <td>${user.name}</td>
                </tr>
            </#list>
            </tbody>
        </table>
    </body>
</html>
