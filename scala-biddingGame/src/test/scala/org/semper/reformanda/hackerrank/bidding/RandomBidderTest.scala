package org.semper.reformanda.hackerrank.bidding

class RandomBidderTest {

  "A RandomBidder" should {
    "place its bid inside the appropriate range" in {
      assert(new RandomBidder(5).placeBid())
    }
  }
}