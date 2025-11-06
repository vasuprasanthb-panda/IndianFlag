<!DOCTYPE html>
<html>
<head>
    <title>Indian Flag</title>
    <style>
        .flag { width: 300px; margin: 40px auto; }
        .band { height: 60px; }
        .saffron { background-color: #FF9933; }
        .white { background-color: white; position: relative; }
        .green { background-color: #138808; }

        .chakra {
            width: 60px;
            height: 60px;
            border: 3px solid navy;
            border-radius: 50%;
            position: absolute;
            left: 120px;
            top: 0;
        }

        .like-box { text-align: center; margin-top: 30px; }
        button {
            padding: 10px 20px;
            font-size: 18px;
            background: #007bff;
            border: none;
            color: white;
            border-radius: 6px;
            cursor: pointer;
        }

        h2 { text-align: center; font-family: Arial; }
    </style>
</head>
<body>

<h2>🇮🇳 Indian Flag</h2>

<div class="flag">
    <div class="band saffron"></div>

    <div class="band white">
        <div class="chakra"></div>
    </div>

    <div class="band green"></div>
</div>

<div class="like-box">
    <form method="post" action="/">
        <button type="submit">👍 Like</button>
    </form>

    <p>Total Likes: <b><%= request.getAttribute("likes") %></b></p>
</div>

</body>
</html>