Module P04_07
    Sub Main()
        '�û�����һ������
        Console.Write("��������һ�����֣�")
        Dim str As String = Console.ReadLine()
        'ת����double
        Dim number As Double = Double.Parse(str)
        '��ӡ���
        Dim result As Double = number * number
        Console.WriteLine("����ǣ�" & result)
        Console.WriteLine("�����������")
        Console.ReadLine()
    End Sub
End Module
