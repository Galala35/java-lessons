public class AddFunction implements CloseOpen{
	
	public double res = 0;
	public boolean save = true;
	
	//������� ����������
	public void clearResult(){
		this.res = 0;
	}
	//���������� ����������
	public boolean save(){
		return save;
	}
	
	//����� ��������� ����������
	@Override
	public double getResult() {
		return res;
	}
	//����� ���������� � �������
	@Override
	public double pow() {
		double num1 = 0;
		double num2 = 0;
		res = Math.pow(num1, num2);
		return res;
	}
	
}