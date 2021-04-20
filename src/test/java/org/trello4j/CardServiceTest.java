package org.trello4j;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import org.trello4j.model.Card;

/**
 * @author Johan Mynhardt
 */
public class CardServiceTest {

    // Note: this url was used to generate token with read, write permissions:
    // https://trello.com/1/authorize?key=23ec668887f03d4c71c7f74fb0ae30a4&name=My+Application&expiration=never&response_type=token&scope=read,write

	/* Associated with damien.cuvillier+test-dev@gmail.com transient test account */

    private static final String API_KEY = "207697bcce1184038e2f00f25831a905";
    private static final String API_TOKEN = "92493300e827596f96cb47f6248763923bbf40d90e89d32383ed631690aaaf0b";
    /* @see https://trello.com/b/NKLAkp1V/test-todolist-aaaaaaaaaaaaaaaaaaaaa"
    * Ask me for access ;-)
    **/
    private static final String BOARD_ID = "NKLAkp1V";


    @Test
	public void testCreateCard() {
		/* Choses à faire */
		String listId = "5f1fef4213e3070db56cb6a3";

		String name = "Trello4J CardService: Add Card using POST";
		String description = "Something awesome happened :)";

		Map<String, String> map = new HashMap<String, String>();
        map.put("desc", description);

        // WHEN
		Card card = new TrelloImpl(API_KEY, API_TOKEN).createCard(listId, name, map);

        // THEN
		assertNotNull(card);
		assertThat(card.getName(), equalTo(name));
		assertThat(card.getDesc(), equalTo(description));
	}

	@Test
	public void testMoveCard() {
    	/* "En cours" */
    	String oldListId = "5f1fef42ad7af91a4a3cd135";
    	/* Choses à faire */
    	String newListId = "5f1fef4213e3070db56cb6a3";
    	/* "TEST jUnit move Card" */
		String cardId = "607eebf9d588260ae096d3c6";

		Card c = new TrelloImpl(API_KEY, API_TOKEN)
			.moveCardToList(cardId, newListId);

		assertEquals(newListId, c.getIdList());

		// Go Back to previous list
		new TrelloImpl(API_KEY, API_TOKEN)
			.moveCardToList(cardId, oldListId);


	}
}
