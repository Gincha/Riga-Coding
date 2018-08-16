var name ='';
var messageText = '';
var d = new Date();
var time = "";
var counter = 0;


function sendMessage() {
    counter += 1;
    name = document.getElementById('username').value;
    messageText = document.getElementById('usermsg').value;


    timeHour = d.getHours();
    timeMin = d.getMinutes();
    timeSec = d.getSeconds();

    time = timeHour + ":" + timeMin + ":" + timeSec;

 

    var $message = $('<div>');
    if (counter%2 ==0){
        $message.addClass('container textMsg darker');
    }else{
        $message.addClass('container textMsg msg1');
    }
    
    $message.append('<label id="msg-title">' + '<b>'+ name+ '</b>' +'</label>');
    $message.append('<p id="msg-text">'+ messageText + '</p>');
    $message.append('<span id="msg-time">' + time + '</span>');

    $('#chat-box').append($message);

    $('#usermsg').val('');
 
    return $message;
}

$('#usermsg').on('keyup', function (event){
    if (event.keyCode == 13){
        if($('#username').val()=='' || $('#usermsg').val()==''){
            alert('Please fill out all the fields!');
        }else{    
            sendMessage();
        }
    }
});

$('#username').on('keyup', function (event){
    if (event.keyCode == 13){
        if($('#username').val()=='' || $('#usermsg').val()==''){
            alert('Please fill out all the fields!');
        }else{    
            sendMessage();
        }
    }
});