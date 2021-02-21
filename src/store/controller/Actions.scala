package store.controller

import javafx.event.{ActionEvent, EventHandler}
import store.model.checkout.SelfCheckout

/**
 * EventHandlers for each of the button on the SelfCheckout. NumberAction takes
 * an Int representing the which number button was pressed. You may assume
 * that each of these classes has a reference to the same SelfCheckout object.
 */

class NumberAction(SelfCheckout: SelfCheckout, number: Int) extends EventHandler[ActionEvent] {
  override def handle(event: ActionEvent): Unit = {
    SelfCheckout.numberPressed(number)
  }
}

class ClearAction(SelfCheckout: SelfCheckout) extends EventHandler[ActionEvent] {
  override def handle(event: ActionEvent): Unit = {
    SelfCheckout.clearPressed()
  }
}

class EnterAction(SelfCheckout: SelfCheckout) extends EventHandler[ActionEvent] {
  override def handle(event: ActionEvent): Unit = {
    SelfCheckout.enterPressed()
  }
}

class CheckoutAction(SelfCheckout: SelfCheckout) extends EventHandler[ActionEvent] {
  override def handle(event: ActionEvent): Unit = {
    SelfCheckout.checkoutPressed()
  }
}

class CashAction(SelfCheckout: SelfCheckout) extends EventHandler[ActionEvent] {
  override def handle(event: ActionEvent): Unit = {
    SelfCheckout.cashPressed()
  }
}

class CreditAction(SelfCheckout: SelfCheckout) extends EventHandler[ActionEvent] {
  override def handle(event: ActionEvent): Unit = {
    SelfCheckout.creditPressed()
  }
}

class LoyaltyAction(SelfCheckout: SelfCheckout) extends EventHandler[ActionEvent] {
  override def handle(event: ActionEvent): Unit = {
    SelfCheckout.loyaltyCardPressed()
  }
}
