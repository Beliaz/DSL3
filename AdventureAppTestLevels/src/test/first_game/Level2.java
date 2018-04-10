package test.first_game;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.company.IAction;
import com.company.IContext;
import com.company.IObject;
import com.company.IPerson;
import com.company.IState;
import com.company.Person;
import com.company.Player;
import com.company.TextAdventureLevel;


public class Level2 extends TextAdventureLevel {


	public void initialize(IContext context) {
		
		super.initialize(context);
	}

	@Override
	protected String getDescription(IContext context) {
		return "In the entrance room...";
	}

	@Override
	protected List<IPerson> getPersons(IContext context) {
		return new ArrayList();
	}
	@Override
	public String getNextLevel(IContext context) {
		return Level2.class.getName();
	}

	@Override
	protected List<IAction> getActions(IContext context) {
		// TODO Auto-generated method stub
		return new ArrayList();
	}
}
