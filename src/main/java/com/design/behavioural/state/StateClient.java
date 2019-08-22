package com.design.behavioural.state;

/*
The state pattern is set to solve two main problems.

1) An object should change its behavior when its internal state changes.
2) State-specific behavior should be defined independently.
 That is, adding new states should not affect the behavior of existing states.

 State pattern vs Strategy pattern.

 1) State pattern helps object to manage state, while Strategy pattern allows client to choose different behaviour.
 2) In case of Strategy pattern, it's client, which provides different strategy to Context,
  on State pattern, state transition is managed by Context or State itself, Also,
   if you are managing state transition in State object itself, it must hold reference of Context

 */
public class StateClient
{
  public static void main(String[] args)
  {
    ParcelContext parcelContext = new ParcelContext(null);
    parcelContext.update();
    parcelContext.update();
    parcelContext.update();

    // no effect
    parcelContext.update();
    parcelContext.update();
    parcelContext.update();
  }
}
