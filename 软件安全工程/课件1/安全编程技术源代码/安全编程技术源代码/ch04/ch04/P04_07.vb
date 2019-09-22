Module P04_07
    Sub Main()
        '用户输入一个数字
        Console.Write("请您输入一个数字：")
        Dim str As String = Console.ReadLine()
        '转换成double
        Dim number As Double = Double.Parse(str)
        '打印结果
        Dim result As Double = number * number
        Console.WriteLine("结果是：" & result)
        Console.WriteLine("程序运行完毕")
        Console.ReadLine()
    End Sub
End Module
