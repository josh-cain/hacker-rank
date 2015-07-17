package org.semper.reformanda.hackerrank.bidding

trait Bidder {

  def placeBid(player: Int, scotchPosition: Int, player1Bids: List[Int] , player2Bids: List[Int]): Int

  def payForBid(amount: Int): Bidder

  def bidsForPlayer(player: Int, player1Bids: List[Int], player2Bids: List[Int]): List[Int] =
    if (player == 1) player1Bids else player2Bids

}