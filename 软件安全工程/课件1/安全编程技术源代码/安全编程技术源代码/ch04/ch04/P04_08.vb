Module P04_08
    Sub Main()
        '�����쳣������
        On Error Resume Next
        '�û�����һ������
        Console.Write("��������һ�����֣�")
        Dim str As String = Console.ReadLine()
        'ת����double
        Dim number As Double = Double.Parse(str)
        '��ӡ���
        Dim result As Double = number * number
        Console.WriteLine("����ǣ�" & result)
        Console.WriteLine("�����������")
    End Sub
End Module
