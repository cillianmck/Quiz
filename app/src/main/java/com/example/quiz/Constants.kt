package com.example.quiz

object Constants {

    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val question1 = Question(1,"What is the capital of Ireland?", "Belfast",
        "Cork","Dublin","London", 3)

        questionList.add(question1)

        val question2 = Question(2,"Who is Arsenals leading goalscorer?", "Ian Wright",
            "Thierry Henry","Pierre-Emerick Aubameyang","Robin Van Persie", 2)

        questionList.add(question2)

        val question3 = Question(3,"Who is the current Prime Minister of the United Kingdom?", "David Cameron",
            "Joe Biden","Theresa May","Boris Johnson", 4)

        questionList.add(question3)

        val question4 = Question(4,"Who is the host of The Chase?", "Bradley Walsh",
            "Alexander Armstrong","Richard Osman","Paul Sinha", 1)

        questionList.add(question4)

        val question5 = Question(5,"Where is the 2021 summit of COP26 taking place?", "Paris",
            "Moscow","London","Glasgow", 4)

        questionList.add(question5)

        val question6 = Question(6,"Honda is a car company from which country?", "South Korea",
            "Japan","Germany","Spain", 2)

        questionList.add(question6)

        val question7 = Question(7,"How many sides does a hexagon have?", "Ten",
            "Five","Six","Eight", 3)

        questionList.add(question7)

        val question8 = Question(8,"Who does Rocky defeat in Rocky IV?", "Tommy Gunn",
            "Apollo Creed","Ivan Drago","Mike Tyson", 3)

        questionList.add(question8)

        val question9 = Question(9,"How long is an Olympic-size swimming pool?", "50 metres",
            "25 metres","100 metres","40 metres", 1)

        questionList.add(question9)

        val question10 = Question(10,"Who is the oldest club in the English Football League", "Celtic",
            "Aston Villa","Birmingham","Nottingham Forest", 4)

        questionList.add(question10)



        return questionList
    }

}