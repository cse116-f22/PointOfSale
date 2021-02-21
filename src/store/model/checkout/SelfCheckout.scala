package store.model.checkout

import store.model.items.Item

class SelfCheckout {

  def addItem(barcode: String, item: Item): Unit = {
    // TODO
  }

  // inputs
  def numberPressed(number: Int): Unit = {
    // TODO
  }

  def clearPressed(): Unit = {
    // TODO
  }

  def enterPressed(): Unit = {
    // TODO
  }

  def checkoutPressed(): Unit = {
    // TODO
  }

  def cashPressed(): Unit = {
    // TODO
  }

  def creditPressed(): Unit = {
    // TODO
  }

  def loyaltyCardPressed(): Unit = {
    // TODO
  }


  // outputs
  def displayString(): String = {
    ""
    // TODO
  }

  def receiptLines(): List[ReceiptLine] = {
    List()
    // TODO
  }

  def prepareStore(): Unit = {
    // Similar to openMap in the Pale Blue Dot assignment, this method is not required and is
    // meant to help you run manual tests.
    //
    // This method is called by the GUI during setup. Use this method to prepare your
    // items and call addItem to add their barcodes. Also add any sales/tax/etc to your
    // items
    //
    // This method will not be called during testing and you should not call it in your tests.
    // Each test must setup its own items to ensure compatibility in AutoLab
  }

}
