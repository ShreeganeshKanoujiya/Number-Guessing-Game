import random

def number_guessing_game():
    number_to_guess = random.randint(1,100)
    number_to_tries = 0
    has_guessed_correctly = False

    print("Welcome to the Number Guessing Game!")
    print("I'm thinking of a number between 1 to 100. Can you guess it?")

    while not has_guessed_correctly:
        guess_input = input("Enter your guess number: ")

        if not guess_input.isdigit():
            print("That's not a valid number, try again.")
            continue

        guess=int(guess_input)
        number_to_tries += 1

        if guess < 1 or guess > 100:
            print("Please guess a number between 1 to 100.")
        elif guess < number_to_guess:
            print("Too low! Try again.")
        elif guess > number_to_guess:
            print("Too high! Try agian.")
        else:
            has_guessed_correctly = True
            print(f"Congratulations! You guessed the number in {number_to_tries} tries.")

if __name__ == "__main__":
    number_guessing_game()