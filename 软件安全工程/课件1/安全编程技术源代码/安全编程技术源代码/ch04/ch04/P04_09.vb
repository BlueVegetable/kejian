Module P04_09
    Sub Main()
        '遇到异常，跳到handle执行
        On Error GoTo handle
        '用户输入一个数字
        Console.Write("请您输入一个数字：")
        Dim str As String = Console.ReadLine()
        '转换成double
        Dim number As Double = Double.Parse(str)
        '打印结果
        Dim result As Double = number * number
        Console.WriteLine("结果是：" & result)
        Console.WriteLine("程序运行完毕")
        Exit Sub
handle:
        Console.WriteLine("对不起，程序异常")
        Console.WriteLine("程序运行完毕")
    End Sub
End Module
