import React from 'react';

import '../../assets/css/style.css';
import '../../assets/css/characters/Characters.css';

const Characters = () => {
    const movies = [];

    const alpha = Array.from(Array(26)).map((e, i) => i + 65);
    const alphabet = alpha.map((x) => String.fromCharCode(x));

    return (
        <div>
          <canvas className='characters-background' />
          <div className="container shadow bg-white">
            <h2 className='title'>Characters</h2>

            <ul className='alphabet-pagination pagination pagination-sm border-0'>
              {alphabet.map(letter => {
                return <li className='letter'><a href="#">{letter}</a></li>;
              })}
            </ul>

            <div className="movies">
              {movies}
            </div>
          </div>
          {/* links to the film/cartoons/series characters */}
        </div>
    );
}

export default Characters;
