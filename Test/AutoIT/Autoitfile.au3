WinWaitActive("Opening autoit-v3-setup.exe","","20")
If WinExists("Opening autoit-v3-setup.exe") Then
Send("{TAB}")
Sleep(1000)
Send("{Enter}")
EndIf