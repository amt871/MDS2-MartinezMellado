import { LitElement, html, css, customElement } from 'lit-element';

@customElement('vista-video_hashtag__usuario_registrado__item')
export class VistaVideo_hashtag__usuario_registrado__item extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: center;" theme="spacing-s">
 <img style="height: 90%; width: 90%;" src="../../resources/icons/video.svg">
 <label>Descripcion</label>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
