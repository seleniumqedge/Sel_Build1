
ControlFocus("File Upload","","Edit1")

WinWaitActive("File Upload")

ControlSetText("File Upload","","Edit1","D:\Demo\xyz.png")

WinWaitActive("File Upload")

ControlClick("File Upload","","Button1")