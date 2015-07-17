package org.semper.reformanda.hackerrank.bidding

import scala.util.Random

class RandomBidder(val bidderMoney: Int) extends Bidder {

  override def placeBid(player: Int, scotchPosition: Int, player1Bids: List[Int], player2Bids: List[Int]): Int = 
    Random.nextInt(remainingMoney(bidsForPlayer(player, player1Bids, player2Bids)))

  override def payForBid(bidAmount: Int): Bidder =
    new RandomBidder(bidderMoney - bidAmount)

  def remainingMoney(previousBids: List[Int]): Int =
    bidderMoney - previousBids.foldLeft(0)((a,b) => a + b)
}