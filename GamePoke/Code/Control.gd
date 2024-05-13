extends Control

func _ready():
	set_process_input(true)

func _input(event):
	if event is InputEventKey:
		if event.scancode != KEY_SPACE && event.scancode != KEY_TAB:
			get_tree().change_scene("res://scenes/Scene1.tscn")
