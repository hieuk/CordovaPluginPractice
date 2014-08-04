var customPlugin = {
    callNativeFunction: function(successFunctionCallback, errorFunctionCallback, args) {
		return cordova.exec(
            null, 
            null, 
            "com.example.cordovapluginpractice.CustomPlugin", 
            "action_toast", 
            [document.getElementById("input").value]
        );
    }
}
module.exports=customPlugin;