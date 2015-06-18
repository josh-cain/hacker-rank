package org.semper.reformanda.hackerrank.bidding

import org.scalatest.WordSpec;

class BidGameStateTest extends WordSpec {

  "A BidGameState" should {
    "move the bottle towards Player1" when {
      "Player1 bids more than Player2" in {
        assert(new BidGameState(1, 5).placeBids(25, 20).bottlePosition == 4)
      }
      "Player1 has the advantage and equal bids are placed" in {
        assert(new BidGameState(1, 5).placeBids(25, 25).bottlePosition == 4)
      }
    }
    "move the bottle towards Player2" when {
      "Player2 bids more than Player1" in {
        assert(new BidGameState(1, 5).placeBids(25, 30).bottlePosition == 6)
      }
      "Player2 has the advantage and equal bids are placed" in {
        assert(new BidGameState(2, 5).placeBids(25, 25).bottlePosition == 6)
      }
    }
  }
}