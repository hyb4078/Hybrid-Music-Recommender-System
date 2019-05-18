<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="zh">

<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Edger Liu, and Bootstrap contributors">
    <meta name="generator" content="Jekyll v3.8.5">
    <title>后台管理登录</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/4.2/examples/floating-labels/">

    <!-- Bootstrap core CSS -->
    <link href="https://cdn.bootcss.com/twitter-bootstrap/4.2.1/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">


    <style>
        .bd-placeholder-img {
            font-size: 1.125rem;
            text-anchor: middle;
        }

        @media (min-width: 768px) {
            .bd-placeholder-img-lg {
                font-size: 3.5rem;
            }
        }
    </style>

    <%-- 使用 web 工程的绝对路径 --%>
    <!-- Custom styles for this template -->
    <link href="/styles/floating-labels.css" rel="stylesheet">
</head>

<body>
<form class="form-signin" _lpchecked="1">
    <div class="text-center mb-4">
        <img class="mb-4" src="/assets/brand/bootstrap-solid.svg" alt=""
             width="72" height="72">
        <h1 class="h3 mb-3 font-weight-normal">后台管理登录</h1>
        <p>Build form controls with floating labels via the <code>:placeholder-shown</code> pseudo-element. <a
                href="https://caniuse.com/#feat=css-placeholder-shown">Works in latest Chrome, Safari, and
            Firefox.</a></p>
    </div>

    <div class="form-label-group">
        <input type="email" id="inputEmail" class="form-control" placeholder="邮箱" required="" autofocus=""
               style="background-image: url(&quot;data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAASCAYAAABSO15qAAAAAXNSR0IArs4c6QAAANJJREFUOBHdUzsOgzAMfaDOiIETcBjUDozcjetwh3CBdsnAgLiAa1uyG+gAtJ1qyYljv+dPAgBwY72z0kEV7JXV5QzZighHJeNVnJ+IcJGfYVZVhbZt3yjW1u7edR2FEAynibyDsiw9c1EUyHMPIY1lmXbuWEX1fY9pmtA0Deq6RowRwzAoKI05KzFeZRLnWVNn4jZtNuIRiEfws8XkDsZxNL/WuVi1eZ7NxLIsbothMSKC6FYs4+7Oz0j8jIbTPD/5kB7blg6cV5yvf6YDBf8a8gSLtXzq+l6rIQAAAABJRU5ErkJggg==&quot;); background-repeat: no-repeat; background-attachment: scroll; background-size: 16px 18px; background-position: 98% 50%; cursor: auto;"
               autocomplete="off">
        <label for="inputEmail">邮箱</label>
    </div>

    <div class="form-label-group">
        <input type="password" id="inputPassword" class="form-control" placeholder="密码" required=""
               style="background-image: url(&quot;data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAASCAYAAABSO15qAAAAAXNSR0IArs4c6QAAAPhJREFUOBHlU70KgzAQPlMhEvoQTg6OPoOjT+JWOnRqkUKHgqWP4OQbOPokTk6OTkVULNSLVc62oJmbIdzd95NcuGjX2/3YVI/Ts+t0WLE2ut5xsQ0O+90F6UxFjAI8qNcEGONia08e6MNONYwCS7EQAizLmtGUDEzTBNd1fxsYhjEBnHPQNG3KKTYV34F8ec/zwHEciOMYyrIE3/ehKAqIoggo9inGXKmFXwbyBkmSQJqmUNe15IRhCG3byphitm1/eUzDM4qR0TTNjEixGdAnSi3keS5vSk2UDKqqgizLqB4YzvassiKhGtZ/jDMtLOnHz7TE+yf8BaDZXA509yeBAAAAAElFTkSuQmCC&quot;); background-repeat: no-repeat; background-attachment: scroll; background-size: 16px 18px; background-position: 98% 50%;"
               autocomplete="off">
        <label for="inputPassword">密码</label>
    </div>

    <div class="checkbox mb-3">
        <label>
            <input type="checkbox" value="remember-me"> 记住登录
        </label>
    </div>
    <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
    <p class="mt-5 mb-3 text-muted text-center">© 2018-2019</p>
</form>

</body>

</html>