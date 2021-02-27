package com.example.fragmentos

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class StartFragmentDirections private constructor() {
  public companion object {
    public fun paraEsquerda(): NavDirections = ActionOnlyNavDirections(R.id.para_esquerda)

    public fun paraDireita(): NavDirections = ActionOnlyNavDirections(R.id.para_direita)
  }
}
