


 Run("Notepad.exe")

 WinWaitActive("Untitled - Notepad")

 ControlSend("Untitled - Notepad","","Edit1","heloloooooooooooooo")

 WinClose("Untitled - Notepad")

 WinWaitActive("Notepad")

ControlClick("Notepad","","Button1")

WinWaitActive("Save As")

ControlFocus("Save As","","Edit1")

Send("E:\seleniumfile.txt")

ControlClick("Save As","","Button1")