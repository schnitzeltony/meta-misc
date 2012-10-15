-- this is an example undecorating all windows opened maximized
-- for further information on setup see
-- http://www.gusnan.se/devilspie2/manual.php

wnd_type = get_window_type()

if(wnd_type == "WINDOW_TYPE_NORMAL") then

	-- add only applications you want maximized+undecorated and
	-- which don't keep maximized state
	apps_list = 
	{
		"Terminal",
		"ristretto",
		"xarchiver",
	}

	app_name = get_application_name()
	wnd_role = get_window_role()

	-- to have some informational output uncomment the following lines and start
	-- devilspie2 with --debug option
	--debug_print ("Window Name: " .. get_window_name())
	--debug_print ("Application name: " .. app_name)
	--debug_print ("window-type: " .. wnd_type)
	--debug_print ("window-role: " .. wnd_role)

	-- undecorate all windows starting maximized 
	if (get_window_is_maximized()) then
		undecorate_window()

	-- maximize all windows in apps_list (unfortunately also their settings)
	else
		for line, str in ipairs(apps_list) do
			if (string.find(app_name, str)) then
				maximize()
				undecorate_window()
				break
			end
		end
	end
end
