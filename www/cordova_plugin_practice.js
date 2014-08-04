var customPlugin = {
    callNativeFunction: function(args) {
		cordova.exec(
            null, 
            null, 
            "com.example.cordovapluginpractice.CustomPlugin", 
            "action_toast",
			[args]
        );
    }
}
module.exports=customPlugin;