package org.trello4j.model;

import java.util.ArrayList;
import java.util.List;

/**
 * A Trello checklist.
 * 
 * <code>
 * {
 * 		id: "602484ccdf6f5682e4b30306",
 * 		name: "checklist ahah",
 * 		idCard: "60248665if6f5682e4b30306",
 * 		pos: 56321,
 * 		idBoard: "60926916e8f4c486b1563717",
 * 		checkItems: [
 * 			{
 * 				idChecklist: "609294ccdf1c48zre4b30306",
 * 				state: "incomplete",
 * 				id: "6092936993596c72e2cb159d",
 * 				name: "tester les test qui testeront les nerfs du testeur",
 * 				nameData: null,
 * 				pos: 164591,
 * 				due: null,
 * 				idMember: null
 * 			},
 * 			{
 * 				idChecklist: "60945dccdf112282e4b30306",
 * 				state: "incomplete",
 * 				id: "60921d468333b01ddfc79762",
 * 				name: "idk i'm a test",
 * 				nameData: null,
 * 				pos: 33844,
 * 				due: null,
 * 				idMember: null
 * 			}
 * 		]
 * }
 * </code>
 * 
 */
public class Checklist extends TrelloObject {

	private String name;
	private String idBoard;
	private String idCard;
	private java.util.List<CheckItem> checkItems = new ArrayList<CheckItem>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdBoard() {
		return idBoard;
	}

	public void setIdBoard(String idBoard) {
		this.idBoard = idBoard;
	}

	public List<CheckItem> getCheckItems() {
		return checkItems;
	}

	public void setCheckItems(List<CheckItem> checkItems) {
		this.checkItems = checkItems;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public class CheckItem extends TrelloObject {

		private String name;
        private String type;
        private String state;
        private String idChecklist;

        /* Need to upgrade to Business Class
        private String due;
        private String idMember */

        private double pos;

        public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

        public double getPos() {
			return pos;
		}

		public void setPos(double pos) {
			this.pos = pos;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getIdChecklist() {
			return idChecklist;
		}

		public void setIdChecklist(String idChecklist) {
			this.idChecklist = idChecklist;
		}
	}
}
