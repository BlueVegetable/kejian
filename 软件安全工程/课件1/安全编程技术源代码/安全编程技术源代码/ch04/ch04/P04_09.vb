Module P04_09
    Sub Main()
        '�����쳣������handleִ��
        On Error GoTo handle
        '�û�����һ������
        Console.Write("��������һ�����֣�")
        Dim str As String = Console.ReadLine()
        'ת����double
        Dim number As Double = Double.Parse(str)
        '��ӡ���
        Dim result As Double = number * number
        Console.WriteLine("����ǣ�" & result)
        Console.WriteLine("�����������")
        Exit Sub
handle:
        Console.WriteLine("�Բ��𣬳����쳣")
        Console.WriteLine("�����������")
    End Sub
End Module
