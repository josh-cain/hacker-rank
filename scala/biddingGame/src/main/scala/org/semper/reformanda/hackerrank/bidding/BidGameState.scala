package org.semper.reformanda.hackerrank.bidding

/**
 * Bidder 1 is assumed to be at the 0 index of the game, whereas Bidder 2 is assumed to be at the N position, where N represents
 * the number of spaces on which the bottle can move.
 *
 * @param bidderAdvantage
 * @param bottlePosition
 */
class BidGameState(val bidderAdvantage: Int, val bottlePosition: Int) {

  def placeBids(bid1: Int, bid2: Int) : BidGameState = {
    val moveBottle: (Int) => Int = {

      if (bid1 == bid2)
        if (bidderAdvantage == 1) (x: Int) => x - 1 else (x: Int) => x + 1
      else if (bid1 > bid2)
        (x: Int) => x - 1
      else // (bid2 > bid1)
        (x: Int) => x + 1
    }

    new BidGameState(swapAdvantage(bidderAdvantage), moveBottle(bottlePosition))
  }

  def swapAdvantage(bidderAdvantage: Int): Int = if(bidderAdvantage == 1) 2 else 1;
}