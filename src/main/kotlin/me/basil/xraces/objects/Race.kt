package me.basil.xraces.objects

import org.bukkit.Effect
import org.bukkit.Sound
import org.bukkit.potion.PotionEffect


abstract class Race{
    abstract val name: String
    abstract val displayName: String
    abstract val passives: List<PotionEffect>
    abstract val dayPassives: List<PotionEffect>
    abstract val nightPassives: List<PotionEffect>
    abstract val permissions: List<String>
    abstract val commands: List<String>
    abstract val dayCommands: List<String>
    abstract val nightCommands: List<String>
    abstract val deathCommands: List<String>
    abstract val respawnCommands: List<String>
    abstract val attributes: List<RaceAttribute>
    abstract val hurtSound: Sound
    abstract val deathSound: Sound
    abstract val teleportSound: Sound
    abstract val teleportEffect: Effect
}