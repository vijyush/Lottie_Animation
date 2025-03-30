package org.vijyusha.project.lottie_animation

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform