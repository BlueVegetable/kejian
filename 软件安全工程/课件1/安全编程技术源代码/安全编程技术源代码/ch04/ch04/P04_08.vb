Module P04_08
    Sub Main()
        '遇到异常，忽略
        On Error Resume Next
        '用户输入一个数字
        Console.Write("请您输入一个数字：")
        Dim str As String = Console.ReadLine()
        '转换成double
        Dim number As Double = Double.Parse(str)
        '打印结果
        Dim result As Double = number * number
        Console.WriteLine("结果是：" & result)
        Console.WriteLine("程序运行完毕")
    End Sub
End Module
