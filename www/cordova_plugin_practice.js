var customPlugin = {
    callNativeFunction: function(args) {
		return cordova.exec(
            null, 
            null, 
            "com.example.cordovapluginpractice.CustomPlugin", 
            "action_toast",
			[args]
        );
    }
}
module.exports=customPlugin;