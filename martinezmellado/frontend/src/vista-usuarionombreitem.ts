import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-usuarionombreitem')
export class VistaUsuarionombreitem extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: center; position: relative;">
 <vaadin-horizontal-layout style="align-items: center; justify-content: center; width: 100%; height: 95%;">
  <vaadin-button theme="icon" aria-label="Add new" id="imagen" style="width: 40%; height: 40%;">
   <img id="imageButton" style="width: 100%; height: 100%;">
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="justify-content: center; align-items: center; height: 5%; width: 100%;">
  <label id="labelUsuario">Label</label>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
