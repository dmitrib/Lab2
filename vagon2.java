package com.company.lw002;

public class vagon2 extends vagon {

	private int Mesta[];

	public void PustojVagon(int NomerVagona) {
		NomerEtogoVagona=NomerVagona;
		Mesta = new int[ChisloMest];
		for (int i=0;i<ChisloMest;i++) Mesta[i]=0;
		// 0 - free
	}

	public void IzmenitxChisloMest(int NewChisloMest){
		super.ChisloMest = NewChisloMest;
	}

	public void ZanyatxMesto(int NomerMesta) {
		if(Mesta[NomerMesta-1]==1)
			System.out.println("Это место уже занято: " + NomerMesta + " (вагон №" + NomerEtogoVagona + ")!");
		Mesta[NomerMesta-1]=1;
		// 1 - zanyato
	}

	public void VagonInfo() {
		System.out.println("Номер Вагона :" + NomerEtogoVagona);
		int SvobMest = 0;
		for(int i = 0; i < ChisloMest; i++){
			if(Mesta[i]!=1)
				SvobMest++;
		}
		System.out.println("Число свободных мест: " + SvobMest);
		System.out.println("Информация о свободных местах: ");
		for (int i=0;i<ChisloMest;i++)
			if (Mesta[i]==0) System.out.print((i+1)+" ");
		System.out.println("\n");
	}
}