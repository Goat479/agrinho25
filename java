const cards = document.querySelectorAll('.flip-card');

cards.forEach(card => {
    card.addEventListener('click', () => {
        const inner = card.querySelector('.flip-card-inner');
        inner.style.transform = inner.style.transform === 'rotateY(180deg)' ? 'rotateY(0deg)' : 'rotateY(180deg)';
    });
});