package com.example.cc17_3f_secollesvn_act6

import FitnessTipAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: FitnessTipAdapter
    private lateinit var fitnessTipList: MutableList<FitnessTip>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // list with 30 different fitness tips, images, and descriptions
        fitnessTipList = mutableListOf()


        fitnessTipList.add( // 1
            FitnessTip(
                R.drawable.image_day1,
                "Practice Mindful Breathing",
                "Start your wellness journey with mindful breathing exercises. Taking a few minutes each day to focus on your breath can reduce stress, lower blood pressure, and improve mental clarity. Sit in a quiet place, close your eyes, and take slow, deep breaths in through your nose and out through your mouth. As you inhale, count to four, hold for four seconds, then exhale for four seconds. This practice helps activate the parasympathetic nervous system, promoting relaxation."
            )
        )

        fitnessTipList.add( // 2
            FitnessTip(
                R.drawable.image_day2,
                "Hydrate Consistently",
                "Hydration is crucial for overall wellness. Drinking enough water keeps your body functioning optimally, supports digestion, improves skin health, and helps flush out toxins. Aim to drink at least 8 glasses of water a day. You can add slices of lemon, cucumber, or mint for a refreshing twist. Keep a reusable water bottle with you as a reminder to stay hydrated throughout the day."
            )
        )

        fitnessTipList.add( // 3
            FitnessTip(
                R.drawable.image_day3,
                "Digital Detox",
                "Give yourself a break from constant screen time by incorporating a digital detox into your routine. Designate an hour or two each day where you disconnect from your phone, laptop, and other electronic devices. Use this time to focus on reading, journaling, or spending time in nature. Reducing screen time helps improve sleep quality and reduces eye strain, enhancing your mental health."
            )
        )

        fitnessTipList.add( // 4
            FitnessTip(
                R.drawable.image_day4,
                "Stretch for Flexibility",
                "Stretching is vital for maintaining flexibility and preventing injury. Set aside 10-15 minutes each morning to perform gentle stretches. Focus on areas that tend to hold tension, such as your neck, shoulders, and lower back. Stretching not only improves mobility but also enhances posture and relieves stress. Yoga poses like the Cat-Cow, Child’s Pose, and Downward Dog are excellent for releasing tension."
            )
        )

        fitnessTipList.add( // 5
            FitnessTip(
                R.drawable.image_day5,
                "Take a Nature Walk",
                "Spending time in nature can do wonders for your physical and mental well-being. A 20-minute walk outside helps reduce stress, elevate your mood, and boost creativity. Take in the sights, sounds, and smells of your surroundings, allowing yourself to be fully present in the moment. Whether it’s a park, forest, or beach, nature offers a calming escape from daily stressors."
            )
        )

        fitnessTipList.add( // 6
            FitnessTip(
                R.drawable.image_day6,
                "Practice Gratitude",
                "Gratitude is a powerful tool for improving emotional well-being. Take a few moments at the end of each day to reflect on the things you’re grateful for. Whether it's the support of a friend, a beautiful sunset, or a small achievement, focusing on the positives helps shift your mindset and reduce stress. You can write down three things you're grateful for in a journal each day."
            )
        )

        fitnessTipList.add( // 7
            FitnessTip(
                R.drawable.image_day7,
                "Aromatherapy for Relaxation",
                "Aromatherapy is a holistic healing treatment that uses natural plant extracts to promote health and well-being. Essential oils such as lavender, eucalyptus, and chamomile are known for their calming properties. Use a diffuser to fill your space with soothing scents, or apply a few drops of essential oil to your wrists or temples for instant relaxation. Aromatherapy can improve mood, reduce anxiety, and enhance sleep."
            )
        )

        fitnessTipList.add( // 8
            FitnessTip(
                R.drawable.image_day8,
                "Eat a Rainbow of Fruits and Vegetables",
                "Nourish your body by incorporating a variety of colorful fruits and vegetables into your diet. Each color group offers different nutrients and health benefits. For example, red foods like tomatoes are rich in antioxidants, while green veggies like spinach provide essential vitamins. Aim to 'eat the rainbow' to boost immunity, support heart health, and increase energy levels."
            )
        )

        fitnessTipList.add( // 9
            FitnessTip(
                R.drawable.image_day9,
                "Journaling for Mental Clarity",
                "Journaling is a great way to process emotions and clear your mind. Write about your day, set goals, or explore your feelings in a private, judgment-free space. Journaling helps with self-reflection, personal growth, and problem-solving. It can also be a powerful stress-relief tool, allowing you to release negative thoughts and gain a new perspective."
            )
        )

        fitnessTipList.add( // 10
            FitnessTip(
                R.drawable.image_day10,
                "Practice Mindful Eating",
                "Mindful eating is about paying full attention to your food—its flavors, textures, and aromas—without distractions. Eat slowly and savor each bite, making conscious choices about what you eat and how much. This practice encourages a healthier relationship with food, helping you recognize hunger and fullness cues, which can prevent overeating and improve digestion."
            )
        )

        fitnessTipList.add( // 11
            FitnessTip(
                R.drawable.image_day11,
                "Get a Good Night's Sleep",
                "Quality sleep is essential for overall wellness. Aim for 7-9 hours of uninterrupted sleep per night to allow your body to rest and repair. Create a calming bedtime routine by turning off screens an hour before bed, dimming the lights, and practicing relaxation techniques like deep breathing. A consistent sleep schedule improves mood, boosts cognitive function, and strengthens the immune system."
            )
        )

        fitnessTipList.add( // 12
            FitnessTip(
                R.drawable.image_day12,
                "Try a New Hobby",
                "Exploring new hobbies can reduce stress and improve mental well-being. Whether it’s painting, knitting, photography, or learning a new instrument, engaging in creative activities keeps your mind sharp and gives you a sense of accomplishment. It’s a great way to take a break from routine and reconnect with yourself."
            )
        )

        fitnessTipList.add( // 13
            FitnessTip(
                R.drawable.image_day13,
                "Spend Time with Loved Ones",
                "Human connection is a key aspect of emotional wellness. Set aside time to connect with friends or family, whether it’s through a phone call, a meal, or a shared activity. Positive social interactions reduce feelings of loneliness and foster a sense of belonging and support. Strong relationships are a foundation of mental well-being."
            )
        )

        fitnessTipList.add( // 14
            FitnessTip(
                R.drawable.image_day14,
                "Reduce Caffeine Intake",
                "Too much caffeine can increase anxiety, disrupt sleep, and cause jitteriness. Try reducing your caffeine intake by switching to herbal teas or decaf coffee in the afternoon. Cutting down on caffeine can help improve focus, enhance sleep quality, and stabilize energy levels throughout the day."
            )
        )

        fitnessTipList.add( // 15
            FitnessTip(
                R.drawable.image_day15,
                "Daily Affirmations",
                "Positive affirmations can reframe your mindset and encourage self-compassion. Start your day by repeating uplifting statements like 'I am capable', 'I am worthy', or 'I am in control'. Regularly practicing affirmations can help boost confidence and cultivate a more optimistic outlook on life."
            )
        )

        fitnessTipList.add( // 16
            FitnessTip(
                R.drawable.image_day16,
                "Volunteer or Help Someone",
                "Giving back to the community or helping someone in need fosters a sense of purpose and boosts emotional well-being. Volunteering your time, donating to charity, or even offering a helping hand to a friend can bring fulfillment and create positive social connections."
            )
        )

        fitnessTipList.add( // 17
            FitnessTip(
                R.drawable.image_day17,
                "Meditate for Inner Peace",
                "Daily meditation promotes inner peace and reduces stress. Spend 5-10 minutes in a quiet space, focusing on your breath or repeating a calming mantra. Meditation improves focus, emotional stability, and mental clarity, making it an essential practice for overall wellness."
            )
        )

        fitnessTipList.add( // 18
            FitnessTip(
                R.drawable.image_day18,
                "Declutter Your Space",
                "A cluttered environment can contribute to stress and overwhelm. Spend some time decluttering your living or workspace by getting rid of items you no longer need. Organizing your surroundings can bring a sense of order and calm to your daily life, improving focus and productivity."
            )
        )

        fitnessTipList.add( // 19
            FitnessTip(
                R.drawable.image_day19,
                "Prioritize Self-Care",
                "Self-care is essential for maintaining emotional and physical well-being. Set aside time each week for activities that bring you joy, whether it's reading a book, taking a bath, or engaging in creative hobbies. Prioritizing self-care helps reduce stress and replenishes your energy."
            )
        )

        fitnessTipList.add( // 20
            FitnessTip(
                R.drawable.image_day20,
                "Set Boundaries",
                "Setting healthy boundaries in both personal and professional relationships is vital for emotional well-being. Learn to say no when necessary and communicate your needs effectively. Boundaries protect your mental health and prevent burnout by ensuring you have time for self-care and relaxation."
            )
        )

        fitnessTipList.add( // 21
            FitnessTip(
                R.drawable.image_day21,
                "Limit Sugar Intake",
                "Excess sugar can lead to energy crashes, weight gain, and other health issues. Try reducing your intake of sugary snacks and drinks by opting for healthier alternatives like fresh fruits, nuts, or yogurt. Limiting sugar helps maintain stable energy levels and supports better overall health."
            )
        )

        fitnessTipList.add( // 22
            FitnessTip(
                R.drawable.image_day22,
                "Sunlight Exposure for Vitamin D",
                "Spending time in the sunlight is a natural way to boost vitamin D levels, which supports bone health, mood, and immune function. Aim for 10-15 minutes of sunlight exposure a few times a week, preferably in the morning or late afternoon when the sun is less intense."
            )
        )

        fitnessTipList.add( // 23
            FitnessTip(
                R.drawable.image_day23,
                "Mindful Listening",
                "Practice mindful listening when communicating with others by giving them your full attention, avoiding interruptions, and being present in the moment. Mindful listening fosters stronger relationships and helps you develop deeper connections with the people in your life."
            )
        )

        fitnessTipList.add( // 24
            FitnessTip(
                R.drawable.image_day24,
                "Take a Break from Multitasking",
                "Multitasking can reduce productivity and increase stress. Instead, focus on one task at a time to improve the quality of your work and reduce mental strain. Taking breaks between tasks helps refresh your mind and maintain overall wellness."
            )
        )

        fitnessTipList.add( // 25
            FitnessTip(
                R.drawable.image_day25,
                "Eat More Plant-Based Meals",
                "Incorporating more plant-based meals into your diet can improve digestion, reduce inflammation, and support heart health. Try adding more legumes, whole grains, and vegetables to your meals while reducing your intake of processed meats and refined sugars."
            )
        )

        fitnessTipList.add( // 26
            FitnessTip(
                R.drawable.image_day26,
                "Unwind with a Warm Bath",
                "Taking a warm bath at the end of the day is a great way to relax and relieve muscle tension. Adding Epsom salts, essential oils, or bath bombs to the water can enhance the experience, providing both physical and mental relaxation."
            )
        )

        fitnessTipList.add( // 27
            FitnessTip(
                R.drawable.image_day27,
                "Laugh Often",
                "Laughter is a natural stress reliever that boosts your mood and improves overall well-being. Watch a funny movie, read a humorous book, or spend time with people who make you laugh. Incorporating laughter into your daily routine can help reduce anxiety and improve emotional resilience."
            )
        )

        fitnessTipList.add( // 28
            FitnessTip(
                R.drawable.image_day28,
                "Disconnect Before Bed",
                "Reduce screen time at least 30 minutes before bed to improve sleep quality. Blue light from screens can interfere with melatonin production, making it harder to fall asleep. Instead, unwind with a relaxing activity like reading or meditation to prepare your mind for rest."
            )
        )

        fitnessTipList.add( // 29
            FitnessTip(
                R.drawable.image_day29,
                "Create a Vision Board",
                "A vision board is a visual representation of your goals and dreams. Use images, quotes, and affirmations that inspire you to create a board that reflects what you want to achieve. Keep it somewhere visible to remind yourself of your intentions and stay motivated."
            )
        )

        fitnessTipList.add( // 30
            FitnessTip(
                R.drawable.image_day30,
                "Celebrate Your Progress",
                "Reflect on the progress you’ve made over the last 30 days and celebrate your achievements. Whether it’s improved mental clarity, reduced stress, or enhanced physical health, take pride in your efforts and continue building positive habits for long-term wellness."
            )
        )


        adapter = FitnessTipAdapter(fitnessTipList)
        recyclerView.adapter = adapter
    }
}
