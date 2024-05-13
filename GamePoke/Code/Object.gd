extends Object

func _ready():
	if Engine.has_singleton("IsUsingCustomBuild") and OS.get_name() == "Android":
		var context = Engine.get_singleton("GodotAndroid")
		context.callv("myMethod", [])
