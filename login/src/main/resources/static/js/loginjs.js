//    清空按钮事件
const clear = document.getElementById('clearButton');
clear.addEventListener('click', function(event){
    // 阻止默认事件
    event.preventDefault();

    // 弹框确认
    if(confirm('入力した情報をクリアしますか？')){
        // 确认后清空表单
        document.getElementById('username').value = '';
        document.getElementById('password').value = '';
        }
})

// 登录按钮事件
$('#loginButton').click(function(){
    // 用户名和密码不能为空
    if($('#username').val() == '' || $('#password').val() == ''){
        return alert('Username,Passwordを入力してください。');
    }

    // 点击登录按钮，向后台发送请求
    const username = $('#username').val();
    const password = $('#password').val();

    let namepass = {
        userName : username,
        password : password
    }

    namepass = JSON.stringify(namepass);

    console.log(namepass);
    $.ajax({
        type: "POST",
        url: "http://localhost:8080/login",
        data: namepass,
        contentType: 'application/json;charset=UTF-8',
        dataType: 'json',
        success:function(res){
            console.log(res);
            if(res.success == true){
                alert("登録成功");
                location.href = "index.html"
            }else {
                alert(res.msg)
            }
        }
    })
})
