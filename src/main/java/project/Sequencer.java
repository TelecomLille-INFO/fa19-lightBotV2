package project;

import org.newdawn.slick.Graphics;

public class Sequencer {
	private Controler controleur;
	private int moveCount = 0;
	
	public Sequencer(Controler p_c){// constructeur de la classe sequencer 
		this.controleur = p_c;// enlever le controleur et mettre la liste de windowGame
	}

	private String returnCarriage(String p_s, int nbMove){
		if((nbMove+1)%6==0){
			p_s+="\n";
		}
		return p_s;		
	}	
	
	public void decomposition(Graphics p_g){// affiche les controleurs selectionnes

		String toReturn = "";
		for(int i=0; i<this.controleur.listControleur.size(); i++){
			switch (this.controleur.listControleur.get(i)){
				case haut :
					toReturn+="haut ";
				break;
				case bas :
					toReturn+="bas ";
				break;
				case gauche :
					toReturn+="gauche ";
				break;
				case droite :
					toReturn+="droite ";
				break;
				case vide :
					toReturn+="";
				break;
			}
			toReturn = this.returnCarriage(toReturn,i);
		}
		p_g.drawString(toReturn, 510, 250);
		moveCount = this.controleur.listControleur.size();
	}
	
	public int getMoveCount() {
		return moveCount;
	}
	
}